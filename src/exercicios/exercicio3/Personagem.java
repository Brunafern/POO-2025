package exercicios.exercicio3;

public class Personagem {
    private String nome;
    private int saude;
    private int experiencia;

    public Personagem(String nome) {
        this.nome = nome;
        this.saude = 100;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getSaude() {
        return saude;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void sofrerDano() {
        int dano = 10 - (experiencia / 100);
        if (dano < 1) {
            dano = 1;
        }

        saude -= dano;

        if (saude < 0) {
            saude = 0;
        }
    }

    public void recuperarSaude(int quantidade) {
        if (quantidade <= 0) return;

        saude += quantidade;
        if (saude > 100) {
            saude = 100;
        }
    }

    public void ganharExperiencia() {
        if (experiencia < 1000) {
            experiencia += 100;
            if (experiencia > 1000) {
                experiencia = 1000;
            }
        }
    }
    public static void main(String[] args) {
        Personagem p = new Personagem("Bruna");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Saúde: " + p.getSaude());
        System.out.println("Experiência: " + p.getExperiencia());
        p.sofrerDano();

        System.out.println("\nApós sofrer dano com 0 de experirncia:");

        System.out.println("Saúde: " + p.getSaude());
        p.ganharExperiencia();
        p.ganharExperiencia();
        p.ganharExperiencia();
        p.ganharExperiencia();
        p.ganharExperiencia();
        System.out.println("\nApós ganhar 500 de experiencia:");
        System.out.println("Experiencia: " + p.getExperiencia());

        p.sofrerDano();
        System.out.println("Saúde após dano com 500 de XP (dano deve ser 5): " + p.getSaude());

        p.recuperarSaude(20);
        System.out.println("Saude após recuperar 20: " + p.getSaude());

        for (int i = 0; i < 10; i++) {
            p.ganharExperiencia();
        }
        System.out.println("\nExperiência após várias tentativas de ganho (máx 1000): " + p.getExperiencia());

        p.sofrerDano();
        System.out.println("Saúde após dano com 1000 de XP : " + p.getSaude());
    }
}

