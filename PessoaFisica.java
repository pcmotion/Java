public class PessoaFisica {
	protected String nome;
	protected String cpf;
	protected String rg;
//	public PessoaFisica(String nome,String cpf,String rg){
//		boolean cpfValido=false;
//		this.nome=nome;
//		
//		if()
//	}
	public boolean valida(String cpf){
		int [] indiceCpf = new int[12];
		int indice=0;//Indice para os Loops
		int somador=0;//Usado para soma dos digitos
		int digito1=0;//Resultado do 1 digito depois do loop
		int result1=0;//Resto da soma dos digitos dividido por 11
		int result2=0;//Resto da soma dos digitos dividido por 10
		int digito2=0;//Resuldado do 2 digito depois do loop
		int valor=0;
		if(cpf.length()==11){
			for(indice=0;indice<11;indice++){
				indiceCpf[indice]=Integer.parseInt(cpf.substring(indice, indice+1));
			}
			for(indice=0;indice<9;indice++){
				somador=somador+indiceCpf[indice]*(10-indice);//Soma dos numeros
			}
			result1=somador%11; //Resto
			if(result1<2){
				digito1=0;
			}
			else{
				digito1=11-result1;
			}
			somador=0;//Cauculo 2 Digito
			for(indice=0;indice<10;indice++){
				somador=somador+indiceCpf[indice]*(11-indice);
			}
			valor=(somador/11)*11;
			result2=somador-valor;
			if(result2<2){
				digito2=0;
			}
			else{
				digito2=11-result2;
			}
			if((digito1==indiceCpf[9])&&(digito2==indiceCpf[10])){  //Resultados da Validação
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}
