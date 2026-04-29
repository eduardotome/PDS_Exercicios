
	public class PlanoAcademia {

	    public static double calcular(String plano, String freq, String duracao) {

	        double valor = 0;

	        if (plano.equals("basico")) valor = 80;
	        else if (plano.equals("inter")) valor = 120;
	        else if (plano.equals("premium")) valor = 180;

	        if (freq.equals("3x")) valor += valor * 0.2;
	        else if (freq.equals("5x")) valor += valor * 0.5;

	        if (duracao.equals("semestral")) valor -= valor * 0.1;
	        else if (duracao.equals("anual")) valor -= valor * 0.2;

	        return valor;
	    }
	}
	
	
	
	
	
	
	

