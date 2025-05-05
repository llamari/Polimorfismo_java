# Polimorfismo_java
## Objetivo
O objetivo desse projeto é aprender e aplicar conceitos de polimorfismo em Java. Exemplificando esses conceitos com uma polimorfismo no qual há uma herança e as subclasses herdam e utilizam métodos das superclasses.

## Estrutura
- **Funcionario.java:** Classe base com atributos comuns a todos os funcionários;
- **Freelancer.java:** Subclasse de Funcionário que calcula o salário do Freelancer;
- **Desenvolvedor.java, Estagiario.java, Gerente.java:** Subclasses de Funcionarios, representando diferentes cargos. Cada uma sobrescrevendo MostrarDados e tenho um método construtor e um método próprio;
- **Main.java:** Classe principal para execução e demonstração das classes. Nesse arquivo é onde ocorre toda interação com o usuário.

## Como Executar
1. Clone o repositório:
```bash
git clone https://github.com/llamari/Heranca_Java.git
```
2. Navegue até o diretório do projeto:
```bash
cd Heranca_Java
```
3. Compile os arquivos Java:
```bash
javac *.java
```
4. Execute a aplicação:
```bash
java Main
```
