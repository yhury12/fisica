import kotlin.math.pow

class fisica {
    fun calcPeso(massa: Double, gravidade: Double): Double {
        return massa * gravidade
    }
    fun calcForcaCentripeta(massa: Double,raioDoCirculo: Double,velocidade: Double ): Double{
        return velocidade.pow(velocidade) / raioDoCirculo * massa
    }
    fun calcImpulso(forca: Double,tempo: Double): Double {
        return forca * tempo
    }
    fun calcForcaElastica(constanteElastica: Double,deformacao:Double): Double{
        return constanteElastica * deformacao
    }
    fun calcVelocidadeMedia(tempo: Double, deslocamento: Double): Double {
        return deslocamento / tempo
    }
    fun calcMRU(posicaoInicial: Double,velocidade: Double,tempoInicial: Double,tempoFinal: Double): Double {
        return posicaoInicial + velocidade *(tempoFinal - tempoInicial)
    }
    fun calcMRUV(posicaoInicial: Double,velocidade: Double,tempo: Double,aceleracao: Double): Double {
        return (tempo.pow(tempo) * aceleracao /2) + tempo * velocidade + posicaoInicial
    }
}



