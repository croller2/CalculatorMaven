/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.car.calculatormaven.controller;

import edu.wctc.car.calculatormaven.models.AreaCalculatorService;
import edu.wctc.car.calculatormaven.models.CircleService;
import edu.wctc.car.calculatormaven.models.RectangleService;
import edu.wctc.car.calculatormaven.models.TriangleService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chris
 */
@WebServlet(name = "Calculator", urlPatterns = {"/calc"})
public class Calculator extends HttpServlet {
    private static final String RESULT_PAGE = "/calculatorInput.jsp";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            response.setContentType("text/html;charset=UTF-8");
            String calcType = request.getParameter("calcType");
           
            if(calcType.equalsIgnoreCase("rectangle")) {
                String height = request.getParameter("rectangleHeight").trim();
                String width = request.getParameter("rectangleWidth").trim();
                AreaCalculatorService calc = new RectangleService(width, height);
                double area = calc.calculateArea();
                request.setAttribute("area", area);
                request.setAttribute("type", "rectangle");
            } else if(calcType.equalsIgnoreCase("circle")) {
                String radius = request.getParameter("circleRadius").trim();
                AreaCalculatorService calc = new CircleService(radius);
                double area = calc.calculateArea();
                request.setAttribute("area", area);
                request.setAttribute("type", "circle");
            }else{
                String sideA = request.getParameter("triangleSideA").trim();
                String sideB = request.getParameter("triangleSideA").trim();
                TriangleService calc = new TriangleService(sideA,sideB);
                double sideC = calc.calcSideC();
                request.setAttribute("area", sideC);
                request.setAttribute("type", "triangle");
            }
           
            RequestDispatcher view =
                    request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
