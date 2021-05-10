# Udemy_JavaCompleto
Desenvolvimento dos exercícios, projetos e anotações de aula do curso "Java COMPLETO Programação Orientada a Objetos + Projetos" Curso na plataforma Udemy, ministrado pelo professor Nelio Alves

## Seccão 03 - Instalação de ambiente

### Instalando o Java (11) no windows

1. Faça o download da versão 11 de x64  
[zulu](https://www.azul.com/downloads/zulu-community/?package=jdk)

2. Criar pasta:  
C:\Program Files\JAVA  

3. Copiar o conteúdo descompactado do download para a pasta criada.  

4. Configure as variáveis do sistema:  
	Iniciar -> Editar as váriáveis de ambiente do sistema  

	Propriedades do sistema  
		Aba **Avançado** -> Variáveis de ambiente  

		Variáveis do sistema -> Novo  
			Nome da Variável: JAVA_HOME  
			Valor da Variável: C:\Program Files\JAVA\"nome da pasta baixada"  
		
		Encontre na lista a variável Path -> Editar  
			Novo -> C:\Program Files\JAVA\"nome da pasta baixada"\bin  
				Mover para cima -> Clique até a variável estar no topo da lista  
### Instalando o Eclipse (IDE)

[Eclipse](https://www.eclipse.org/downloads/packages/)

### Declaração de variáveis - Aula 22

**tipo** nomeVar = comando/valor;  
  |		|			|____ Resultado de comando ou calor pré definido (Opcional)  
  |		|  
  |		|________________ Nome da Varíável  
  |  
  |______________________ Tipo de variável  


### Declaração de constantes

**tipo** static final CONSTANTE = valor;  
  |			|	  |		|			|____ Resultado de comando ou calor pré definido (Opcional)  
  |		  	|	  |		|  
  |		    |	  |		|________________ Nome da constante  
  |		    |	  |  
  |			|	  |______________________ indica que a constante não sofrerá alterações  
  |			|  
  |		    |____________________________ tira a necessidade de instanciar  
  |  
  |______________________________________ Tipo da constante  


**tipo** de variáveis (ou constantes) brutas  
**Inteiros**  
- byte
- short
- int
- long  

**Decimais**  
- float
- double  

**Caracteres**
- char (1 caracter)
- *String* (vários caracteres)
	|_tem que começar com S maiúsculo_

**Lógico**
- boolean (true/false)

### Boas práticas
Nome de váriável  
- Não pode começar com nº (use letra ou Underline)  
- Sem espaços  
- Sem acentos
- camelCase ->  Primeira letra em minusculo
	- (variáveis, parâmetros, metodos, atributos, pacotes)

Nome de Classe  
- PascalCase - Primeira letra em Maiúsculo

Usando Variáveis  
- Float usa f no final
- Double usa .0 no final

Declarando constantes  
- Usar declaração final
- Nome todo em LETRAS_MAIUSCULAS
- Espaços separados por _

[Unicode](https://unicode-table.com/pt/)

### Atalhos

| Atalho | Comando |
| ------ | ------- |
| sysout _Ctrl+Espaco_ | System.out.println() |
| _Ctrl+Shift+F_ | Auto identação do texto |
| _Ctrl+Shift+O_ | Otimiza importação utilidade |
| _Ctrl+Shift+B_ | Toggle Breakpoint (Marca ínicio do Debug passo a passo) |
| _F6_ | Step Over (Próximo passo do Debug) |
| _Ctrl+F2_ | Terminate (Encerra Debug) |


### Aula 24 - Saída de dados
```java
System.out.print("Mensagem");		//Imprime "Mensagem" sem quebra de linha  
System.out.println("Mensagem");		//Imprime "Mensagem" com quebra linha  
System.out.printf("%.2f%n",X);		//Imprime variável X com a possibilidade de formatação  
```
Opções de formatação
- (%f = float)
- (%d = decimal inteiro)
- (%s = string de texto)
- (%.2f = 2 casas decimais)
- (\n ou %n = Quebra de linha)

Obs.: Usa a referência de localidade do computador para definir se usa , ou . para decimais.  

#### Caso use impressão de valores decimais em formato americano (. em lugar de ,)


```java
//Importar a utilidade Locale antes do código
import java.util.Locale;

//Dentro do programa, execute o comando
Locale.setDefault(Locale.US);
```

#### Concatenando valores
```java
System.out.print("tempo=" + x "s");		//Impressão concatenando string "tempo=" com a variável X e com a string "s"  
System.out.printf("tempo=%.2fs", x);		//O mesmo citado acima, mas usando o printf (string,var1,var2,...,varn)  
```

[Mais Info](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)

### Aula 25 - Atribuindo valores
```java
var1 = var2 + var3				// atribuição comum do resultado de operação em uma variável  
var1 = (double) var2 + var3		// Casting, tratando o resultado como (double), antes de guardar em var1  
```

| Operador | Operação |
| -------- | -------- |
| + | Soma |
| - | Subtração |
| * | Multiplicação |
| / | Divisão |
| % | Resto de div. |

### Aula 26 e 27 - Entrada de dados

```java
// Importar a utilidade "Scanner"  
import java.util.Scanner;  

//Crie um objeto tipo "Scanner" da seguinte forma:  
Scanner sc = new Scanner (System.in);  

// Scaneia proxima entrada do teclado e guarda em var1  
var1 = sc.next(); 			// guarda como string de texto  
var1 = sc.next().charAt(0);	// guarda como string de texto  
var1 = sc.nextInt(); 		// guarda como inteiro  
var1 = sc.nextDouble(); 	// guarda como double (não esqueça do locale para entrada com .)  

//Ao usar mais de um sc seguido, a leitura é feita na mesma linha, separada por espaços.  

var1 = sc.nextLine(); 		// guarda toda a linha digitada como string de texto  

sc.close();					// Quando não precisar mais do objeto sc  

```

#### **obs.:** Ao usar o nextLine(), entre outros next() é necessário um nextLine() a mais para absorver a quebra de linha.

### Aula 28 - Funções matemáticas

| Função | Operação |
| -------- | -------- |
| Math.sqrt(x) | __Raiz Quadrada__ de x|
| Math.pow(x,y) | x elevado a yº __Potência__ |
| Math.abs(x) | x Absoluto (__Módulo__) |
| Math.PI | Valor da constante __PI__ |

[Mais Info](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)


### Aula 33 - Expressões comparativas

| Operador | Significado |
| -------- | ----------- |
| > | maior |
| < | menor |
| >= | maior ou igual |
| <= | menor ou igual |
| == | igual |
| != | diferente |

### Aula 34 - Expressões lógicas

| Operador | Significado |
| -------- | ----------- |
| && | E |
| \|\| | OU |
| ! | NÃO |

Tabela verdade do operador "E"

| A | B | A && B |
| - | - | - |
| F | F | F |
| F | V | F |
| V | F | F |
| V | V | V |

Tabela verdade do operador "OU"

| A | B | A \|\| B |
| - | - | - |
| F | F | F |
| F | V | V |
| V | F | V |
| V | V | V |

Tabela verdade do operador "NÂO"

| A | ! A |
| - | - |
| F | V |
| V | F |

### Aula 35 - Estrutura condicional

#### Estrutura condicional simples (if)

```java
if (condição) {
	cmd1;
	cmd2;
} 
```

#### Estrutura condicional composta (if else)

```java
if (condição) {
	cmd1;
	cmd2;
} 
else {
	cmd3;
	cmd4;
}
```

#### Encadeamento de estrutura condicional

```java
if (condição) {
	cmd1;
	cmd2;
} 
else {
	if (condição){
	cmd3;
	cmd4;
	}
	else {
	cmd5;
	cmd6;
	}
}
```
##### Forma simplificada (else if)
```java
if (condição) {
	cmd1;
	cmd2;
} 
else if (condição){
	cmd3;
	cmd4;
	}
	else {
	cmd5;
	cmd6;
}
```

### Aula 38 - Atribuição cumulativa

| Operador | Significado |
| -------- | ----------- |
| a += b; | a = a + b; |
| a -= b; | a = a - b; |
| a \*= b; | a = a \* b; |
| a /= b; | a = a / b; |
| a %= b; | a = a % b; |

### Aula 39 - switch case
```java
switch (var1) {
case valor1:
	cmd1;
	cmd2;
	break;
case valor2:
	cmd3;
	cmd4;
	break;

default:
	cmd5;
	cmd6;
	break;
}
```

### Aula 40 - Expressão condicional ternária

```java
(condição) ? valorSeVerdadeiro : valorSeFalso;
```

### Aula 44 - Como usar o Debug
| Função no menu | Descrição | Atalho |
| -------------- | --------- | ------ |
| Toggle Point | (Ponto de inicio passo a passo no Debug) | Ctrl+Shift+B |
| Step Over	| (Comando para próximo a passo) | F6 |
| Terminate | (Encerrar Debug)	| Ctrl+F2 |

### Aula 45 - Estrutura repetitiva enquanto (while)

```java
while (condição) {
	cmd1;
	cmd2;
}
```

### Aula 50 - Estrutura repetitiva para (for)

Bom para estrutura baseadas em contagem

```java
for (inicio;condição;incremento) {
	cmd1;
	cmd2;
}
```
Exemplo de inicio  
int i = 0  

Exemplo de condição  
i < varNum  

Exemplo de incremento  
i++ => i = i + 1  
i-- => i = i - 1  

### Aula 55 - Estrutura repetitiva faça enquanto (do-while)

Executa o comando e só depois faz a verificação  
Garante que os comandos sejam executados pelo menos uma vez.  

```java
do {
	cmd1;
	cmd2;
} while (condição);
```

### Aula 58 - Operadores Bitwise

| Operador | Significado |
| -------- | ----------- |
| & | Operação "E" bit a bit |
| \| | Operação "OU" bit a bit |
| ^ | Operação "OU-Exclusivo" bit a bit |

Tabela verdade do operador "OU-Exclusivo"

| A | B | A ^ B |
| - | - | - |
| F | F | F |
| F | V | V |
| V | F | V |
| V | V | F |

Usado para programar interface de rede e programação baixo nível.  

0b -> declaração de formato binario  
0b10 = 2 decimal  

### Aula 59 - Funções interessantes para String

- Formatar: toLowerCase(), toUpperCase(), trim()
- Recortar: substring(inicio), substring(inicio, fim)
- Substituir: Replace(char, char), Replace(string, string)
- Buscar: IndexOf, LastIndexOF
- str.Split("")

Declaração de vetor:

```java
	String[] vect;	// declaração simples de vetor String.
	String[] vect = sc.nextLine().split(" ");	// Cria um vetor a partir do que for digitado na linha usando " " como separador.
````

### Aula 60 - Comentários

```java
/* Comentáro
de Bloco */

// Comentário de linha
```

### Aula 61 - Funções (Sintaxe)

public static tipoVarRetorno nomeMetodo(a , b , c) {}  
  |		  |			|				|		|	   |____ Comandos executados no método, retorna valor ao usar **return**  
  |		  |			|				|		|  
  |		  |			|				|		|___________ Argumentos usados no método  
  |		  |			|				|  
  |		  |			|				|___________________ nome do método (função)  
  |		  |			|  
  |		  |			|___________________________________ Tipo de variável de retorno (void se não houver retorno)  
  |		  |  
  |		  |_____________________________________________ Usar static caso seja uma função no objeto de execução do programa  
  |  
  |_____________________________________________________ Modificador de acesso: public ou private  


```java
public class Main { 
	
	public static void main(String[] args) {
		
	} // Marca fim de main

	// A função deve ser declarada depois do objeto, mas antes do fim do programa.
	public static tipoVarRetorno nome (argumento1, argumento2 ) {
	
	return valor;
	// se não retornar nada, tipoVarRetorno = void
	}
	
} //Marca fim do programa
```

### Aula 65 e 66 - Criando uma classe e declarando um método

Menus Eclipse
	New Java Class
	- Package: 	nomePacote
	- Name:		NomeClasse
	Finish

```java
package nomePacote 				//Pertencente ao pacote nomePacote

public class NomeClasse { 		//inicio de declaração da classe NomeClasse

	public double a; 				//declaração de atributro a do tipo double pertencente a NomeClasse

	public double nomeMetodo() { //inicio de declaração do metodo nomeMetodo

		return a;					//valor de retorno

	}								//fim de declaração da função

}									//fim de declaração da classe
```

#### declação de objeto

Mesmo processo usado para criar o Scanner sc  

NomeClasse nomeObjeto = new NomeClasse(a, b);  
	|		|			 |			|________ Construtor da classe NomeClasse contendo os argumentos a e b  
  	|		|			 |  
  	|		|			 |___________________ Indicação de novo objeto  
  	|		|  
  	|		|________________________________ Nome do objeto  
  	|  
  	|________________________________________ Nome da classe  

```java
NomeClasse nomeObjeto = new NomeClasse(a, b);
```

#### Diagrama de classe (UML)

```java
/*	_________________________
 	| 	NomeClasse	|
 	|---------------------- |
 	|---------------------- |
	| Atributo de Exemplo 1 |
	| - A: double  		|
	| Atributo de Exemplo 3 |
	|---------------------- |
	| Metodo de Exemplo 1	|
	| + Area() : double	|
	|_______________________|*/
```

### Aula 67

**this**.atributo = especifica o atributo como o declarado na Classe

### Aula 68 - Object e toString

função toString() retorna informações da classe em String, pode ser sobrescrita para retornar outra string definida.  

String.format("%.2f", var); permite formatar uma saída de String  

### Aula 71 e 72 - Membros estáticos (static)
Usado para classes utilitárias e declaração de constantes  

Você não pode chamar um método que não é estático(static) dentro de um metodo estático  

#### Estrutura estática no programa principal

```java
public class Main { 
	
	public static final double PI = 3.14159; // declaração de constante usando final

	public static void main(String[] args) {
	} 										// Marca fim de main
											// A função deve ser declarada depois do objeto, mas antes do fim do programa.

	public static tipoVarRetorno nomeMetodo(argumento1, argumento2) {
	return valor;							// se não retornar nada, tipoVarRetorno = void
	}
} 											//Marca fim do programa
```

#### Estrutura estática em uma public class

```java
public class NomeClasse { 
	
	public static final double PI = 3.14159; // declaração de constante usando final

	public static tipoVarRetorno nomeMetodo(argumento1, argumento2) {
	return valor;							// se não retornar nada, tipoVarRetorno = void
	}
	
}											//Marca fim da classe
```
### Aula 76 - Construtores, Aula 77 - Palavra this e Aula 78 - Sobrecarga

Construtor = forma de pré-configurar como instanciar uma classe a um objeto

Palavra this = referência a atributo do objeto

Sobrecarga = É possível declarar mais de um construtor para o mesmo objeto.


#### Estrutura de um construtor

public NomeClasse(tipoVar a ,tipoVar b) {}  
  			|				|			 |_________ Comandos executados na construção do objeto  
  			|				|  
  			|				|______________________ Argumentos para construir o objeto  
  			|  
  			|______________________________________ Nome da classe  

```java
public class NomeClasse { 
	
	public double var1; 				// declaração de variável

	public NomeClasse(double var1) {	//inicio da declaração do construtor
		this.var1 = var1;				//o recebido em var1 do contrutor é atribuido ao var1 do objeto
										//obs.: o this.var1 referencia ao atributo do objeto
	}									//fim da declaração do construtor

	public NomeClasse(){				// Declaração do construtor padrão
										// haver mais de um construtor dá mais opções ao construir objetos 
	}									// Esta funciona em sobrecarga com a declaração anterior

} 										//Marca fim da classe
```

### Aula 79 - Encapsulamento

```java
public class NomeClasse { 				//Marca início da classe

	private double var1;				//Atributos inacessiveis de forma comum para evitar acidentes

	public void setVar1(double var1) {	//Método padronizado para alterar valor do atributo var1
		this.var1 = var1;
	}

	public double getVar1() {			//Método padronizado para ler valor do atributo var1
		return var1;
	}	
} 										//Marca fim da classe
```

[JavaBeans](https://en.m.wikipedia.org/wiki/JavaBeans)

### Aula 80 - Encapsulamento automático no eclipse

#### Construtor
Botão direito -> Source -> Generate Constructor using Fields...  
		Alt+Shift+S 	->				O  

#### Getters e Setters
Botão direito -> Source -> Generate Getters and Setters...  
		Alt+Shift+S 	->				R  

### Aula 81 - Modificadores de Acesso

[DOC_JAVA](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

|   | Diferentes classes mas mesmo pacote | Diferentes pacotes mas subclasses | Classes não relacionadas mas mesmo módulo | Módulo diferentes e p1 não exportado |
| - | ----------------------------------- | --------------------------------- | ----------------------------------------- | ----------------------------- |
| private int i; | Inacessivel | Inacessivel | Inacessivel | Inacessivel |
| int j; | Acessivel | Inacessivel | Inacessivel | Inacessivel |
| protected int k; | Acessivel | Acessivel | Inacessivel | Inacessivel |
| public int l; | Acessivel | Acessivel | Acessivel | Inacessivel |

[REF](https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in)

### Aula 89 - Vetores primitivos

```java
double[] nomeVetor = new double[n]; // cria um vetor do tipo double com nome nomeVetor e n elementos

nomeVetor[n]; 						// acessa ao valor guardado na posição n do vetor nomeVetor
```

### Aula 90 - Vetores de Classe

```java
Classe[] nomeVetor = new Class[n]; // cria um vetor nomeVetor para guardar os endereços de n objetos da classe Classe

nomeVetor[n] = new Class // declara o conteúdo de nomeVetor na posição n como um objeto de classe Classe
```

nomeVetor.lenght = quantidade de elementos em vetor com nomeVetor.

### Aula 92 - Boxing Unboxing e Wrapper classes

Wrapper classes = são classes que emulam as classes primitivas;  
por serem classes, aceitam valor null e usa dos recursos de Orientação a Objeto.  

| Primitiva | Wrapper |
| --------- | ------- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |

### Aula 93 - Laço for Each

para cada objeto 'apelido' em coleção faça  

for (tipoVar apelido : coleção) {}  
		|		|			|____ nome da fonte (Lista, vetor)  
		|		|  
		|		|________________ apelido para referência  
		|  
		|________________________ tipo de dados da fonte  

```java
for (tipoVar apelido : coleção) {
	cmd1;
	cmd2;
}
```

### Aula 94 e 95 - Listas
obs.: não aceita valores de tipos primitivos.

assim como nos vetores as referências de posição começam no 0.

[Referencia](https://docs.oracle.com/javase/10/docs/api/java/util/List.html)

```java
List<Integer> list = new ArrayList<>();			// Cria uma lista de nome list, subclasse Arraylist para conter numeros inteiros

list.add(8);									// Adiciona o valor 8 na última posição da lista list
list.add(0,105);								// Adiciona o valor 15 na posição 0(inicial) da lista list
list.size();									// retorna numero de elementos na lista list
list.remove(2);									// remove valor da posição 2 (terceiro) da lista list
list.removeIf(x -> x > 50);						// remove da lista list os valores que se enquadrem no predicado (x->x>50)
list.IndexOf(105);								// retorna a posição do valor 105 na lista list	

List<Integer> result = list.stream().filter(x -> x % 4 == 0).collect(Collectors.toList());																							// cria uma lista de nome result que contem a busca na lista list dos elementos que se enquadrem no predicado (x->x%4==0) (ou seja: multiplos de 4)

Integer num = list.stream().filter(x -> x % 8 == 0).findFirst().orElse(null);																										// armazena na variável num a primeira ocorrencia da lista que respeite o predicado (x->x%8==0) (ou seja: o primeiro elemento multiplo de 8)

for (int one : list) {
	System.out.println(one);
}

```

### Aula 98 e 99 - Matrizes

vetor de vetores
Linhas e colunas

posição (x, y)

```java
int[][] matrix = new int[m][n];			// Gera matriz de nome matrix com m linhas e n colunas para numeros inteiros

matrix[m][n];							// Acessa valor guardado em matrix na linha m e coluna n

for (int i = 0; i < matrix.lenght; i++) {			// recurso para repetição de linhas
	for (int j = 0; j<matrix[i].lenght; j++) {		// recurso para repetição de colunas
		System.out.println(matrix[i][j]);				// imprime os valores da matrix com o auxilio da ferramenta do for
	}
}
```

### Aula 102 - Date

[Date](https://docs.oracle.com/javase/10/docs/api/java/util/Date.html)

Objeto que armazena o numero de milisegundos desde 01/01/1970 00:00:00 GMT (UTC)

```java
Date d0 = new Date();								// Cria o objeto d0 da classe Date armazenando a data de agora
Date d0 = new Date(System.currentTimeMillis());		// Cria o objeto d0 da classe Date armazenando a data de agora
Date dref = new Date(0L);							// Cria o objeto dref da classe Date armazenando a data de referência
```

[SimpleDateFormat](https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html)

```java
SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");				// Configura formato de data sdf1 como dia/mês/ano
SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	// Configura formato de data sdf2 como dia/mês/ano hora:min:seg
sdf2.setTimeZone(TimeZone.getTimeZone("GMT"))							// Muda exibição no formato sdf2 de Padrão da máquina para GMT
```

Objeto usado para conversão entre Date e String

dd/MM/yyyy -> 02/05/2021
dd/MM/yyyy HH:mm:ss -> 02/05/2021 05:22:00

Padrão ISO 8601

Formato: yyyy-MMM-ddTHH:mm:ssZ

Instant.parse(dataFormatoISO) -> Método que converte dataFormatoISO em Date

```java
Date dISO = Date.from(Instant.parse("2018-06-25T:42:07Z"))	// Exemplo de conversão padrão ISO 8601 para armazenar em dISo Date

Date d1 = sdf1.parse("25/06/2018");							// Converte a data 25/06/2018 em objeto Date e armazena em d1
Date d2 = sdf2.format(d1)									// Muda a formatação da data em d1 armazenando em d2
```

Para saber a diferença de dias entre datas, o mais natural para a plataforma é manter essa conta em Milisegundos.

```java
	// Dica na aula 142

	public long exemplo() {	//declaração de método exemplo
		long diff = dataInicio.getTime() - dataFim.getTime();	// guarda a diferença entre data inicio e data final em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);	// converte essa diferença em milisegundos em unidade de dias
	}

	// Dica na aula 143
	if (dataFim.after(dataInicio)) Sistem.out.print("Confirmado! Data inicio é de fato anterior a data fim");
```

### Aula 103 - Calendar

Objeto que aloca informação data, permitindo operações como adicionar ou remover horas/meses/segundos/dias/etc...

```java
Date d = Date.from(Instant.parse("2018-06-25T:42:07Z"))		// Criação de objeto Data de nome d usando padrão ISO

Calendar cal = Calendar.getInstance();						// Instancia objeto cal da Classe Calendar

cal.setTime(d);												// Alocação da informação contida em d no objeto Calendar cal

cal.add(Calendar.HOUR_OF_DAY, 4);							// Alterando o valor contido em cal adicionando 4 horas

d = cal.getTime();											// Retorna o valor alterado em cal, substituindo o valor em d 

System.out.println(cal.get(Calendar.MINUTE));				// Imprime os minutos guardados na data do objeto cal da classe Calendar
```

Obs.: Para o Calendar o ano começa com mês 0 (JAN).

### Aula 106 - Git e Github

Principais operações

| Operação | Descrição |
| -------- | --------- |
| Clone | Copia o repositório remoto para seu computador |
| Pull | Atualiza seu repositório local em relação ao remoto |
| Commit | Salva uma nova versão (tipicamente no seu repositório local) |
| Push | Envia o repositório local para o repositório remoto |

### Aula 107 - Instalando o Git

[Download](https://git-scm.com/downloads)

#### Opções recomendadas:
 - Use Vim as Gits´s default editor
 - Use Git from Windows Comand Prompt
 - Use the OpenSSL Library
 - Checkout Windows-style, commit Unity-style endings
 - Use MinTTY
 - **DESMARCAR:** Enable Git Credential Manager

### Aula 108 - Demo - Criando um novo projeto

Windows -> Painel de controle -> Opções de Pasta -> Modo de exibição
	Desmarcar "Ocultar as extensões de tipos de arquivos conhecidos"

#### Configurando usuário git conciliando com usuário github
comandos no git bash:
| Comando | Função |
| ------- | ------ |
| git config --list | Lista as configurações guardadas |
| git config --global user.name "__SeuNomeGithub__" | Guarda SeuNomeGithub como nome de usuário |
| git config --global user.email "__SeuEmailGithub__" | Guarda SeuNomeGithub como email do usuário |

#### Iniciando um projeto importado do Github

| Comando | Função |
| ------- | ------ |
| git init | inicia o controle de versão no diretório |
| git remote add origin "URL_RepositórioGithub.git" | Referencia URL_RepositórioGithub como fonte/destino de repositório online |
| git pull origin master | Deveria puxar as referências do projeto, __mas pra mim não funcionou__ |
| git clone URL_RepositórioGithub | Copia as informações do diretório URL_RepositórioGithub para o seu repositório |
| git pull | Traz as informações do repositório online para o repositório local |
| git status | Verifica como estão os arquivos do diretório em relação ao controle de versão |
| git add . | Insere todos os arquivos em Stage(um estado pré commit) |
| git commit -m "Projeto criado" | Grava o estado de todos os arquivos em Stage, adicionando a mensagem Projeto Criado |
| git push | Envia para o repositório online o conteudo gravado nos commits da máquina local |

### Aula 112 - Kit de Primeiro socorros

| PROBLEMA | $ COMANDO |
| -------- | --------- |
| Quero desfazer tudo que fiz desde o último commit | $ git clean -df </br> $ git checkout -- . |
| Preciso remover o último commit, porém mantendo os arquivos do jeito que estão. | $ git reset --soft HEAD~1 |
| Preciso remover o último commit, inclusive as alterações nos arquivos. | $ git --hard HEAD~1 |
| Quero alterar temporariamente os arquivos do projeto de modo a ficarem no estado do commit informado. </br> ATENÇÂO: não podem haver modificações comittadas no projeto </br> NOTA: para voltar ao último commit faça: </br> git checkout master | git checkout <CodigoCommit> |
| Preciso apagar o último commit **no Github** | git push -f origin Head^:master |
| Quero mudar o meu repositório remoto "origin" | git remote set-url origin URL_RepositórioGithub.git |

### Aula 115 - Enumerações

[Referencia](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

```java
package entities.enums; //SubPacote enum

public enum OrderStatus { //Declaração de OrderStatus, SubClasse contendo as opções abaixo
	
	PENDING_PEYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED;
}

// 
private OrderStatus status; //Declaração de status, objeto da subclasse OrderStatus

```

Conversão de String para enum

```java
OrderStatus os1 = OrderStatus.DELIVERED;
OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
```

#### Notação UML

```java
/*	______________________
 	|      <<Enum>>      |
 	|      NomeEnum      |
 	|------------------- |
 	| Atributo 1 : int 0 |
 	| Atributo 2 : int 1 |
	|------------------- |
	|____________________|*/
```

### Aula 120 - StringBuilder

Objeto para auxiliar na criação de strings longas

```java

```

### Aula 125 - Herança, Aula 127 Sobreposição, Super e @Override e Aula 128 - Classes e métodos final
Lembrando: para declarar variáveis de Classes que serão herdadas, usar __protected__.   
```java
// o uso de extends para associação de Herança da Classe Pai para classe filha
public class final NomeClasseFilha extends NomeClassePai {
	// Obs.: final indica que a classe não possui herdeiros, sendo instancia final

	// Declaração de construtor referênciando classe pai
	public NomeClasseFilha() {
		super();
	}

	// @Override indica ao compilador de que se trata de uma socbreposição
	@Override
	// Declaração do método
	public final String metodo() {
		// Obs.: final indica que o método seja sobreposto.

		// Ao usar o método pai, inserir antes super.
		return super.metodo();
	}
}
```

### Aula 126 - Upcasting e Downcasting

```java
// Upcasting (Classe pai recebe os dados de uma classe filha)
ClassePai ObjetoClassePai = new ClasseFilha();

// Downcasting (Classe filha recebe os dados de uma classe pai - nova classe ganha poder)
ClasseFilha ObjetoClasseFilha = (ClasseFilha) ObjetoClassePai;
```

### Aula 129 - Polimorfismo

```java
// Um objeto da classe pai pode guardar objetos de classes filhas diferentes.

Lista<ClassePai> lista = new Arraylist<>();

lista.add(ClasseFilha1);
lista.add(ClasseFilha2);
```

### Aula 132 e 133 - Classes e Metodos abstratos

```java
public abstract class NomeClassePai {	//Classe pai declarada como abstrata, ou seja:
	// não pode existir objeto instanciado como Classe pai, esta apenas serve de referência para as classes filhas.

protected String var1;	// declaração de variável protegida mas que pode ser acessada pelas classes filhas

public abstract double metodo;	// declaração de metodo abstrato
	// desta forma cada objeto da classe filha pode especificar seu método
	// e o compilador sabe que o metodo abstrato da classe pai absrata deve ser sobrescrito
}
```

Obs.: A notação em UML para uma classe abstrata ou método abstrato é seu nome em _itálico_.

### Aula 138 - Exceções

[Documentação](https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html)

### Aula 139 - Estrutura try-catch, Aula 140 - stack trace e Aula 141 - Finally

```java
try { 
	// Tenta executar o código entre chaves
}
catch (ExceptionType e) {	// Pega caso encontre a excessão
	// executa o código entre chaves
}
catch (ExceptionType e) {
	e.printStackTrace();	// Mostra na tela de execução o tipo de excessão e a pilha de chamada dos métodos

}
catch (ExceptionType e){

}
finally {
	// Executa o código entre chaves independente de ter ocorrido uma excessão ou não
}
```

### Aula 142 - Criando exceções personalizadas

Sugestão de criação do pacote model:

__MODEL__
	|_____________ENTITIES
	|
	|_____________ENUMS
	|
	|_____________EXCEPTION
	|
	|_____________SERVICES

### Aula 145 - Solução boa no tratamento de exceções

[GitHub](https://github.com/Dioguitos/exceptions1-java)

Responsabilidades:
- Excessões:
	Defina uma classe como excessões de dominio **(DomainException)**, herdada da classe RuntimeException para conseguir atribuir excessões prórias dentro do seu código.
- Suas Classes:
	É possível criar nas usas classes através do comando **throw new** uma nova excessão, ou seja, descubra as condições que podem travar seu código, especifique-as e retorne uma excessão de dominio caso ocorra.
- Seu Código:
	Use o recurso **try {} catch (exceprion e) {}** para inspecionar o código e identificar caso ocorra alguma excessão de dominio (ou qualquer outra).

#### Exemplo da Classe DomainExeption

```java
// nova classe DomainException
package model.exceptions;	//localilação do pacote

public class DomainException extends RuntimeException {	// Classe publica, herdada de RuntimeExeption
	private static final long serialVersionUID = 1L;	// Pra quê, não sei, só sei que é assim...
	
	public DomainException(String msg) {	// Construtor, já permitindo uma mensagem em string
		super(msg);
	}
}

```

#### Exemplo de exceção de dominio aplicada na classe

```java
// Exemplo de aplicação, o importante aqui é o uso de throw new DomainExceprion

public void withdraw(Double amount) {	// metodo qualquer
		if (amount > withdrawLimit) {	// teste de condição indesejada
			throw new DomainException("The amount exceeds withdraw limit");	// sintaxe de retorno da excessão usando throw new
		}	// a construção de Domain pede um String como mensagem da excessão
		if (amount > balance) {
			throw new DomainException("Not enough balance");	// é possível retornar a mesma excessão mais de uma vez
		}	// inclusive com mensagens diferentes
		else {
			balance -= amount;	// somente após as validações sendo negativas (sem condições indesejadas) o código é executado.
		}
	}

```

#### Exemplo de exceção de dominio aplicada na classe

```java
		try {
			// Suas linhas de código;
		}
		catch (DomainException e){	// caso encontre algum DomainException dentro de try, suspende-se e imprime a mensagem.
			System.out.println("Error: " + e.getMessage());
		}
		catch (RuntimeException e){	// condição complementar para os erros de execução não planejados.
			System.out.println("Inexpected Error");
		}
		finally {
			// tarefas que necessitam ser executadas independente do código dar certo ou não;
		}
```