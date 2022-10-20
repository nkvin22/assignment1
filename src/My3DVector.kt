class My3DVector(val x:Double, val y:Double, val z:Double) {

    fun dotproduct(vector: My3DVector): Double {
        return  vector.x * x + vector.y * y + vector.z * z
    }

    // crossproduct formaluri determinantit davitvalot
    // first, second, third == crossproduct coordinates

    fun crossproduct(vector: My3DVector): String{

        val first = y * vector.z - z * vector.y
        val second = -(x * vector.z - z * vector.x)
        val third = x * vector.y - y * vector.x

        return "($first; $second; $third)"

    }


}