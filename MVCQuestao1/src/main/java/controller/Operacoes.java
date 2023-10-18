package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OperacoesModel;

@WebServlet("/Operacoes")
public class Operacoes extends HttpServlet {
	private static final long serialVersionUID = 1;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			PrintWriter writer = response.getWriter();
			String num1String = request.getParameter("numero1");
			String num2String = request.getParameter("numero2");
			String num3String = request.getParameter("numero3");
			if (num1String.isEmpty() || num2String.isEmpty() || num3String.isEmpty()) {
				writer.append("Algum dos números não foram inseridos");
			}
			int num1 = Integer.parseInt(num1String);
			int num2 = Integer.parseInt(num2String);
			int num3 = Integer.parseInt(num3String);
			
			OperacoesModel operacoes = new OperacoesModel();
			writer.append(" <HTML>  <BODY> ");
			writer.append("Primeiro número: " + num1 + "<br>Segundo número: " + num2 + "<br>Terceiro número: " + num3);
			writer.append("<br><br>Soma dos números: " + (operacoes.somar(num1, num2, num3)));
			writer.append("<br>Subtração dos números: " + (operacoes.subtrair(num1, num2, num3)));
			writer.append("<br>Multiplição dos números: " + (operacoes.multiplicar(num1, num2, num3)));
			if (num2 != 0 && num3 != 0) {
				writer.append("<br>Divisão dos números: " + (operacoes.dividir(num1, num2, num3)));
				writer.append("<br>Resto da divisão inteira: " + (operacoes.restoDivisao(num1, num2, num3)));
			} else {
				writer.append("<br>Não é possível dividir por zero.<br>");
			}
			writer.append("</BODY>  </HTML>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}