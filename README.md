# Polimorfismo_java
## Objetivo
O objetivo desse projeto é aprender e aplicar conceitos de polimorfismo em Java. Exemplificando esses conceitos de polimorfismo no qual há uma herança e as subclasses herdam e utilizam métodos das superclasses e a superclasse é abstrata.

## Estrutura
- **Funcionario.java:** Classe base com atributos comuns a todos os funcionários;
- **Freelancer.java:** Subclasse de Funcionário que calcula o salário do Freelancer;
- **Vendedor.java:** Subclasse de Funcionário que calcula o salário do Vendedor;
- **Gerente.java:** Subclasse de Funcionário que calcula o salário do Gerente;
- **Empresa.java:** Classe principal para execução e demonstração das classes. Nesse arquivo é onde ocorre toda interação com o usuário.

## Como Executar
1. Clone o repositório:
```bash
git clone https://github.com/llamari/Polimorfismo_java.git
```
2. Navegue até o diretório do projeto:
```bash
cd Polimorfismo_java
```
3. Compile os arquivos Java:
```bash
javac *.java
```
4. Execute a aplicação:
```bash
java Empresa
```
