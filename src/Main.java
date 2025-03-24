public class Main {

    // Método para resolver o sistema linear Ax = b usando o método de Gauss-Jacobi
    public static void gaussJacobi(double[][] A, double[] b, double[] x, int maxIter, double tol) {
        int n = A.length;
        double[] xNew = new double[n];
        double erro;

        for (int iter = 0; iter < maxIter; iter++) {
            // Calcular uma nova solução para cada variável
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        sum += A[i][j] * x[j];
                    }
                }
                // Atualiza a solução x[i]
                xNew[i] = (b[i] - sum) / A[i][i];
            }

            // Calcular o erro (norma infinita) entre a solução atual e a anterior
            erro = 0;
            for (int i = 0; i < n; i++) {
                erro = Math.max(erro, Math.abs(xNew[i] - x[i]));
            }

            // Se o erro for menor que a tolerância, o sistema convergiu
            if (erro < tol) {
                System.out.println("Solução encontrada após " + (iter + 1) + " iterações.");
                return;
            }

            // Atualizar x para a próxima iteração
            System.arraycopy(xNew, 0, x, 0, n);
        }

        System.out.println("Máximo de iterações atingido.");
    }

    public static void main(String[] args) {
        // Exemplo de sistema linear Ax = b
        double[][] A = {
                {5, 2, 2},
                {1, 3, 1},
                {0, 6, 8}
        };
        double[] b = {3, -2, -6};
        double[] x = {0.6, -0.7, -0.75};  // Chute inicial

        // Tolerância e número máximo de iterações
        double tolerance = 1e-6;
        int maxIterations = 3;

        // Chama o método Gauss-Jacobi
        gaussJacobi(A, b, x, maxIterations, tolerance);

        // Exibe a solução
        System.out.println("Solução:");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
