package br.edu.bia.mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import br.edu.bia.mvc.model.Hello;
import br.edu.bia.mvc.service.HelloService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/biaMVC")

public class HelloController extends HttpServlet {
	private HelloService helloService = new HelloService();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// resp.getWriter().write("Hello World!");
		List<Hello> all = helloService.findAll();
		all.forEach(e -> {
			try {
				resp.getWriter().write(e.toString());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BufferedReader reader = req.getReader();
		String line = reader.readLine();
		helloService.create(line);
	}
}
