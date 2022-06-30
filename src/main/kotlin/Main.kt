fun main() {
    val amount = 1000_00
    val percentCommision = amount * 0.0075  //0.75%
    val realCommision = if(percentCommision<35_00) 35_00 else percentCommision.toInt()
    println("Коммисия составит: "+realCommision+" коп.")
}