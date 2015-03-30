import java.util.Scanner;
public class VerificadorCpf{
	int cpf2[] = new int[11];
	int somaX=0,somaY=0;

	public void acharX(){
		for(int i=8,p=2;i>=0;i--,p++){
			somaX=somaX+(cpf2[i]*p);		
		}
		if ((somaX%11) < 2){
			cpf2[9]=0;
		}else{ 
			cpf2[9]=(11-(somaX%11));
		}
	}

	public void acharY(){
	  for(int i=9,p=2;i>=0;i--,p++){
			somaY=somaY+(cpf2[i]*p);		
		}
		if ((somaY%11)<2){
			cpf2[10]=0;
		}else{
			cpf2[10]=(11-(somaY%11));
		}
	}

	public void escreverCpf(){
        System.out.println("O CPF completo é: " + cpf2[0] +""+ cpf2[1] +""+ cpf2[2] +"."+ cpf2[3] +""+ cpf2[4] +""+ cpf2[5] +"."+ cpf2[6] +""+ cpf2[7] +""+ cpf2[8]+"-"+cpf2[9] +""+ cpf2[10]);
	}

	public static void main (String [] args){
		Scanner input=new Scanner(System.in);
    VerificadorCpf ob1=new VerificadorCpf();
    String cpf1;
    int cont=0;
    do{
       if(cont>1){
          System.out.println("O valor inserido tem mais/menos de 9 digitos. Tente novamente!");
        }
        System.out.println("Entre com os 9 primeiro digitos do CPF: ");
        cpf1=input.next();
        cont=2;
    }while(cpf1.length()!=9);
		for (int i=0;i<9;i++){
      char caracter = cpf1.charAt(i);
      ob1.cpf2[i] = Character.getNumericValue(caracter);
    }
    ob1.acharX();
		ob1.acharY();
		ob1.escreverCpf();
	}
}
