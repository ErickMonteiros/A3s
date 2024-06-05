public class Usuario {
    private String nome;
    private String email;
    private int telefone;
    private int nascimento;
    private int cpf;

    public String Getnome() {
        return nome;
    }

    public void Setnome (String nome) {
            this.nome = nome;
    }
    public String Getemail () {
         return email;
    }
    public void Setemail (String email) {
            this.email = email;
     }
    
    public int Gettelefone () {
            return telefone;
     }
    public void Settelefone (int telefone){
            this.telefone = telefone;

    }
    public int Getnascimento () {
            return nascimento;
    }
    public void Setnascimento (int nascimento){
            this.nascimento = nascimento;

    }
    public int Getcpf () {
            return cpf;
    }
    public void Setcpf (int cpf) {
            this.cpf = cpf;
    }

}