# Extended Image Manipulation Language

Uma simples linguagem para realizar operações em imagens inspirado no [iml](https://dl.acm.org/doi/pdf/10.1145/3355378.3355382).

## Trabalho final da disciplina de código: PPGTI1007 - 	LINGUAGENS DE DOMÍNIO ESPECÍFICO

A finalidade dessa linguagem é realizar operações em um conjunto de imagens utilizando poucos comandos. 
Também não é necessária a fluência em linguagens de programação, já que a sintaxe é bem próxima a linguagem natural. 

**Principais Comandos:**

 - `path /path/to/images` : Esse comando é responsável por configurar o caminho do conjunto de imagens que se deseja operar.
 Algumas validações foram implementadas para garantir que o path seja um caminho válido. Por exemplo, podemos começar o path com `./imagens`, `/path/to/images` ou digtar
 diretamente o nome da pasta `imagens`caso o usuário execute o app no mesmo diretório da pasta.
 
 - `rotate by 30` : Este comando opera uma rotação na imagem, mantendo o ponto central como referência. Ele pode ser chamado usando da forma que aparece `rotate by 30` ou apenas usando `rotate 30`. A primeira forma é mais verbosa, contudo se aproxima mais à linguagem natural. Já a segunda torna a digitação mais rápida, o que é bom se tratando para fins de testes de diferentes operações. O valor que procede as palavras deve ser um inteiro e representa o grau que a imagem deve ser rotacionada. Apesar de ser possível utilizar qualquer inteiro para fazer a rotação na imagem, limitamos à, no máximo, 3 algarismos.
 
 - `filter by gray` : A partir desse comando é possível transformar a imagem de entrada para uma escala de cinza. A palarva `by` também é opcional.
 
 - `blur by 30` : O comando blur `blur` contém o elemento opcional `by` seguido de outro elemento que pode ser tanto um número inteiro de 0 à 100 quanto também pode se tratar dos mnemônicos `high`, `low` ou `medium`. Caso se opte pelo número, ele indicará uma escala de 0 a 100% em que o efeito será utilizado. O efeito real se dará no tamanho do kernel de convolução do processo que varia de 3 a 60. Para fins práticos optou-se por escalares inteiros. Caso se opte pelos mnemônicos, temos três possibilidades: `low` aplica 15%, `medium` aplica 50% e `high` aplica 75%.
 
 - `equalize it` :
 
 - `fill by 300` :
 
 - `show it` :
 
 - `save it` :
