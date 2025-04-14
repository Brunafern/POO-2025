package exercicios.exercicio4;

public class Usuario {
    private String email;
    private String senhaCriptografada;


    public Usuario(String email, String senha) {
        this.email = email;
        this.senhaCriptografada = criptografar(senha);
    }

    private String criptografar(String senha) {
        StringBuilder criptografada = new StringBuilder();
        for (char c : senha.toCharArray()) {
            criptografada.append((char)(c + 1));
        }
        return criptografada.toString();
    }

    public String getSenha() {
        return senhaCriptografada;
    }

    public void setSenha(String senha) {
        this.senhaCriptografada = criptografar(senha);
    }


    public boolean login(String email, String senha) {
        return this.email.equals(email) && this.senhaCriptografada.equals(criptografar(senha));
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("abc@gmail.com", "a1c9(d");

        System.out.println("Senha criptografada: " + usuario.getSenha());

        System.out.println("Login com senha correta: " + usuario.login("abc@gmail.com", "a1c9(d"));
        System.out.println("Login com senha errada: " + usuario.login("abc@gmail.com", "senhaerrada"));
        System.out.println("Login com email errado: " + usuario.login("iiii@gmail.com", "a1c9(d"));

    }
}

