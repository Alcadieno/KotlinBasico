fun main(args: Array<String>) {
    var nome ="Fernando" //Variavel Mutavel , infere o tipo STRING
    nome = "Henrique"
    var altura = 178
    var altura2 = 168


    val idade1 = 25  //Variavel Imutavel , Infere o tipo INT
    val idade2 = 30


    val num1 = 128
    val num2 : Byte = 120 //Byte é o unico tipo que precisa ser Definido


    val  trafficLightColor = "Red"

    when (trafficLightColor){ //Estrutura When
        "Red" -> println("Stop")
        "Yellow"-> println("slow")
        "Green" -> println("Go")
        else -> println("Invalid color")
    }

}