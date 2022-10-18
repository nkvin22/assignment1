class My3DVector( val x: Int, val y: Int, val z: Int){

    fun dotproduct(vector: My3DVector): Int{
        return  vector.x * x + vector.y * y + vector.z * z
    }

    // crossproduct determinantit davitvalot , pirveli meore mesame = koordinatebi

    fun crossproduct(vector: My3DVector): String{

        val pirveli = vector.z * y - vector.y * z
        val meore = -(vector.z * x - vector.x * z)
        val mesame = vector.y * x - vector.x * y

        return "($pirveli, $meore, $mesame)"

    }


}