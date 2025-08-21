public class ProjetoAluno {

    
    static class Aluno {
        String nome;
        int matricula;
        double notaAv1;
        double notaAv2;

        public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
            this.nome = nome;
            this.matricula = matricula;
            this.notaAv1 = notaAv1;
            this.notaAv2 = notaAv2;
        }

        
        public String getNome() { return nome; }
        public int getMatricula() { return matricula; }
        public double getNotaAv1() { return notaAv1; }
        public double getNotaAv2() { return notaAv2; }
        public void setNotaAv1(double notaAv1) { this.notaAv1 = notaAv1; }
        public void setNotaAv2(double notaAv2) { this.notaAv2 = notaAv2; }

        
        public void mostrarDados() {
            System.out.println("Dados do Aluno");
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.printf("AV1: %.2f%n", notaAv1);
            System.out.printf("AV2: %.2f%n", notaAv2);
            System.out.printf("Média: %.2f%n", calcularMedia());
            System.out.println("");
        }

        
        public double calcularMedia() {
            return (notaAv1 + notaAv2) / 2.0;
        }

        
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

    
    public static void main(String[] args) {
        
        
        Aluno a1 = new Aluno("Lucas", 1001, 8.0, 7.5);
        Aluno a2 = new Aluno("Lis", 1002, 3.5, 5.0);

        
        a1.mostrarDados();
        System.out.println("Situação: " + a1.verificarAprovacao());
        System.out.println();

        a2.mostrarDados();
        System.out.println("Situação: " + a2.verificarAprovacao());
        System.out.println();

        
        a2.setNotaAv2(6.0);

        
        System.out.println(">>> Após atualização de nota do Bruno:");
        a2.mostrarDados();

        System.out.println("Nova situação do Bruno: " + a2.verificarAprovacao());
    }
}
