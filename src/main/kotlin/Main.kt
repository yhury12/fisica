fun main() {
    val fisica = fisica()

    val forcaPeso = fisica.calcPeso(26.0,2.0)
    val forcaCentripeta = fisica.calcForcaCentripeta(10.0,1.0,2.0)
    val impulso = fisica.calcImpulso(2.5,5.0)
    val forcaElastica = fisica.calcForcaElastica(5.0,2.4)
    val velocidadeMedia = fisica.calcVelocidadeMedia(2.0,5.0)
    val MRU = fisica.calcMRU(1.0,60.0,5.0,10.0)
    val MRUV = fisica.calcMRUV(1.0,60.0,10.0,55.0)

    println("A forca peso è $forcaPeso")
    println("A forca centripeta é $forcaCentripeta")
    println("O impulso é $impulso")
    println("A forca elastica é $forcaElastica")
    println("A velocidade media é $velocidadeMedia")
    println("O MRU é $MRU")
    println("O MRUV é $MRUV")





}