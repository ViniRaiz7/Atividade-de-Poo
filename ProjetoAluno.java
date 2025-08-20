// Arquivo: ProjetoAluno.java
public class ProjetoAluno {

    // ----- Classe Aluno -----
    static class Aluno {
        private String nome;
        private int matricula;
        private double notaAv1;
        private double notaAv2;

        public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
            this.nome = nome;
            this.matricula = matricula;
            this.notaAv1 = notaAv1;
            this.notaAv2 = notaAv2;
        }

        // Getters/Setters básicos (usamos só o necessário no exemplo)
        public String getNome() { return nome; }
        public int getMatricula() { return matricula; }
        public double getNotaAv1() { return notaAv1; }
        public double getNotaAv2() { return notaAv2; }
        public void setNotaAv1(double notaAv1) { this.notaAv1 = notaAv1; }
        public void setNotaAv2(double notaAv2) { this.notaAv2 = notaAv2; }

        // 1) Mostrar os dados do aluno
        public void mostrarDados() {
            System.out.println("----- Dados do Aluno -----");
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.printf("AV1: %.2f%n", notaAv1);
            System.out.printf("AV2: %.2f%n", notaAv2);
            System.out.printf("Média: %.2f%n", calcularMedia());
            System.out.println("--------------------------");
        }

        // 2) Calcular a média
        public double calcularMedia() {
            return (notaAv1 + notaAv2) / 2.0;
        }

        // 3) Verificar aprovação (usa calcularMedia internamente)
        public String verificarAprovacao() {
            double media = calcularMedia();
            if (media >= 7.0) {
                return "Aprovado";
            } else if (media >= 4.0) {
                return "Prova Final";
            } else {
                return "Reprovado";
            }
        }
    }

    // ----- Programa de teste (o "projeto") -----
    public static void main(String[] args) {
        // Em seguida:
        // 1. Crie dois objetos da classe Aluno.
        Aluno a1 = new Aluno("Ana Souza", 1001, 8.0, 7.5);
        Aluno a2 = new Aluno("Bruno Lima", 1002, 3.5, 5.0);

        // Mostrando dados iniciais
        a1.mostrarDados();
        System.out.println("Situação: " + a1.verificarAprovacao());
        System.out.println();

        a2.mostrarDados();
        System.out.println("Situação: " + a2.verificarAprovacao());
        System.out.println();

        // 2. Atualize a nota de um aluno (ex.: atualizar AV2 do Bruno).
        a2.setNotaAv2(6.0); // Bruno melhorou na AV2

        // 3. Mostre os dados atualizados.
        System.out.println(">>> Após atualização de nota do Bruno:");
        a2.mostrarDados();

        // 4. Chame o método para verificar se está aprovado.
        // 5. A função calcularMedia já é usada dentro de verificarAprovacao.
        System.out.println("Nova situação do Bruno: " + a2.verificarAprovacao());
    }
}
