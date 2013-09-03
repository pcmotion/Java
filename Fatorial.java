import javax.swing.JOptionPane;
public class Fatorial {
	public static void main(String[] args) {
		long x;
		int x1;
		int fatorial=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o numero fatorial que deseja"));
		if(fatorial>=0){
			if(fatorial==0){
				JOptionPane.showMessageDialog(null,"O fatorial de 0 é = 1");
			}
			else{
				x=fatorial;
				x1=fatorial;
				while(x1>1){
					x=(x*(x1-1));
					x1=x1-1;
				}
				JOptionPane.showMessageDialog(null,"O fatorial de " + fatorial + " é = " + x);
			}
		}
		else{
			JOptionPane.showMessageDialog(null,"Não Existe Fatorial de Números negativos");
		}

	}

}
