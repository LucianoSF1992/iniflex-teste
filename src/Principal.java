import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Principal {

        public static void main(String[] args) {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                NumberFormat formatoSalario = NumberFormat.getNumberInstance(Locale.of("pt", "BR"));

                formatoSalario.setMinimumFractionDigits(2);
                formatoSalario.setMaximumFractionDigits(2);

                List<Funcionario> funcionarios = new ArrayList<>();

                // 3.1 - Inserindo os funcionários na mesma ordem da tabela

                funcionarios.add(new Funcionario(
                                "Maria",
                                LocalDate.of(2000, 10, 18),
                                new BigDecimal("2009.44"),
                                "Operador"));

                funcionarios.add(new Funcionario(
                                "João",
                                LocalDate.of(1990, 5, 10),
                                new BigDecimal("2284.38"),
                                "Operador"));

                funcionarios.add(new Funcionario(
                                "Caio",
                                LocalDate.of(1961, 5, 2),
                                new BigDecimal("9836.14"),
                                "Coordenador"));

                funcionarios.add(new Funcionario(
                                "Miguel",
                                LocalDate.of(1988, 10, 14),
                                new BigDecimal("19119.88"),
                                "Diretor"));

                funcionarios.add(new Funcionario(
                                "Alice",
                                LocalDate.of(1995, 1, 5),
                                new BigDecimal("2234.68"),
                                "Recepcionista"));

                funcionarios.add(new Funcionario(
                                "Heitor",
                                LocalDate.of(1999, 11, 19),
                                new BigDecimal("1582.72"),
                                "Operador"));

                funcionarios.add(new Funcionario(
                                "Arthur",
                                LocalDate.of(1993, 3, 31),
                                new BigDecimal("4071.84"),
                                "Contador"));

                funcionarios.add(new Funcionario(
                                "Laura",
                                LocalDate.of(1994, 7, 8),
                                new BigDecimal("3017.45"),
                                "Gerente"));

                funcionarios.add(new Funcionario(
                                "Heloísa",
                                LocalDate.of(2003, 5, 24),
                                new BigDecimal("1606.85"),
                                "Eletricista"));

                funcionarios.add(new Funcionario(
                                "Helena",
                                LocalDate.of(1996, 9, 2),
                                new BigDecimal("2799.93"),
                                "Gerente"));

                // 3.2 - Remover o funcionário João

                funcionarios.removeIf(funcionario -> funcionario.getNome().equals("João"));

                // 3.4 - Aumento de 10% no salário dos funcionários
                for (Funcionario funcionario : funcionarios) {
                        BigDecimal aumento = funcionario.getSalario()
                                        .multiply(new BigDecimal("0.10"));

                        funcionario.setSalario(
                                        funcionario.getSalario().add(aumento));
                }

                // 3.5 - Agrupar funcionários por função
                Map<String, List<Funcionario>> funcionariosPorFuncao = new HashMap<>();

                for (Funcionario funcionario : funcionarios) {
                        funcionariosPorFuncao
                                        .computeIfAbsent(
                                                        funcionario.getFuncao(),
                                                        k -> new ArrayList<>())
                                        .add(funcionario);
                }

                // 3.6 - Imprimir os funcionários, agrupados por função
                System.out.println("\nFUNCIONÁRIOS AGRUPADOS POR FUNÇÃO:");

                for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorFuncao.entrySet()) {

                        System.out.println("\nFunção: " + entry.getKey());

                        for (Funcionario funcionario : entry.getValue()) {
                                System.out.println("  - " + funcionario.getNome());
                        }
                }

                // 3.8 - Imprimir funcionários que fazem aniversário nos meses 10 e 12
                System.out.println("\nFUNCIONÁRIOS QUE FAZEM ANIVERSÁRIO NOS MESES 10 E 12:");

                for (Funcionario funcionario : funcionarios) {

                        int mes = funcionario.getDataNascimento().getMonthValue();

                        if (mes == 10 || mes == 12) {
                                System.out.println(
                                                "Nome: " + funcionario.getNome() +
                                                                " | Data de nascimento: " +
                                                                funcionario.getDataNascimento().format(formatter));
                        }
                }

                // 3.9 - Imprimir o funcionário com a maior idade

                Funcionario funcionarioMaisVelho = funcionarios.get(0);

                for (Funcionario funcionario : funcionarios) {

                        if (funcionario.getDataNascimento()
                                        .isBefore(funcionarioMaisVelho.getDataNascimento())) {

                                funcionarioMaisVelho = funcionario;
                        }
                }

                int idade = Period.between(
                                funcionarioMaisVelho.getDataNascimento(),
                                LocalDate.now()).getYears();

                System.out.println("\nFUNCIONÁRIO COM MAIOR IDADE:");
                System.out.println(
                                "Nome: " + funcionarioMaisVelho.getNome() +
                                                " | Idade: " + idade + " anos");

                // 3.10 - Imprimir a lista de funcionários por ordem alfabética

                List<Funcionario> funcionariosOrdenados = new ArrayList<>(funcionarios);

                funcionariosOrdenados.sort(
                                Comparator.comparing(Funcionario::getNome));

                System.out.println("\nFUNCIONÁRIOS EM ORDEM ALFABÉTICA:");

                for (Funcionario funcionario : funcionariosOrdenados) {
                        System.out.println(
                                        "Nome: " + funcionario.getNome() +
                                                        " | Data de nascimento: " +
                                                        funcionario.getDataNascimento().format(formatter) +
                                                        " | Salário: R$ " +
                                                        formatoSalario.format(funcionario.getSalario()) +
                                                        " | Função: " +
                                                        funcionario.getFuncao());
                }

                // 3.11 - Imprimir o total dos salários dos funcionários

                BigDecimal totalSalarios = BigDecimal.ZERO;

                for (Funcionario funcionario : funcionarios) {
                        totalSalarios = totalSalarios.add(funcionario.getSalario());
                }

                System.out.println("\nTOTAL DOS SALÁRIOS DOS FUNCIONÁRIOS:");
                System.out.println("Total: R$ " + formatoSalario.format(totalSalarios));

                // 3.12 - Imprimir quantos salários mínimos ganha cada funcionário

                BigDecimal salarioMinimo = new BigDecimal("1212.00");

                System.out.println("\nQUANTIDADE DE SALÁRIOS MÍNIMOS POR FUNCIONÁRIO:");

                for (Funcionario funcionario : funcionarios) {

                        BigDecimal quantidadeSalariosMinimos = funcionario.getSalario()
                                        .divide(salarioMinimo, 2, java.math.RoundingMode.HALF_UP);

                        System.out.println(
                                        "Nome: " + funcionario.getNome() +
                                                        " | Salário: R$ "
                                                        + formatoSalario.format(funcionario.getSalario()) +
                                                        " | Salários mínimos: " + quantidadeSalariosMinimos);
                }

                // 3.3 - Imprimir todos os funcionários formatados

                System.out.println("FUNCIONÁRIOS:");
                System.out.println();

                for (Funcionario funcionario : funcionarios) {
                        System.out.printf(
                                        "Nome: %s | Data de nascimento: %s | Salário: R$ %s | Função: %s%n",
                                        funcionario.getNome(),
                                        funcionario.getDataNascimento().format(formatter),
                                        formatoSalario.format(funcionario.getSalario()),
                                        funcionario.getFuncao());
                }
        }
}