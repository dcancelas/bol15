package academica;

public class Academica {

    private float numReferencia = 2020;
    private String nome;
    private float nota;

    public Academica() {
    }
    public Academica(float numReferencia, String nome, float nota) {
        this.numReferencia = numReferencia;
        this.nome = nome;
        this.nota = nota;
    }

    public float getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(float numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Academica{" +
                "numReferencia=" + numReferencia +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
