
public class TesteFuncionario {
    public static void main(String[] args) {
        // Dados da Helena
     Funcionario Funcionario_Helena = new Funcionario();   
      Funcionario_Helena.Nome = "Helena Reis";  
      Funcionario_Helena.Nasc = 1965; 
      Funcionario_Helena.Salario = 4000;
      
      
      System.out.println("Nome: "+Funcionario_Helena.Nome);
      Funcionario_Helena.CalcularIdade();
      System.out.println("Salario: "+Funcionario_Helena.Salario);
      
        System.out.println("");
      //Dados do Mario
      Funcionario Funcionario_Mario = new Funcionario();   
      Funcionario_Mario.Nome = "Mario Sá";  
      Funcionario_Mario.Nasc = 1970; 
      Funcionario_Mario.Salario = 3000;
      
      
      System.out.println("Nome: "+Funcionario_Mario.Nome);
      Funcionario_Mario.CalcularIdade();
      System.out.println("Salario: "+Funcionario_Mario.Salario);
    }
}
