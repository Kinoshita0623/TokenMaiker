package compiler

class TokenMaker{

    //与えられた文字列を半角スペースごとに区切ります。
    fun createToken(code: String):ArrayList<String>{
        val list = ArrayList<String>()
        var build = StringBuilder()
        code.forEach{
            if(it.isWhitespace()){
                list.add(build.toString())
                build = StringBuilder()
            }else{
                build.append(it.toString())
            }
        }
        if(build.isNotBlank()) list.add(build.toString())
        return list
    }
}