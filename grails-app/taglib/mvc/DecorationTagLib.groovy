package mvc

// See https://gsp.grails.org/latest/guide/taglibs.html
class DecorationTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = "mvc"

    // Specifies the tag name
    def decorate = { attributes, body ->
        String grade = attributes.grade
        def decor = "<img src='http://2.bp.blogspot.com/"
        switch (grade) {
            case ["1", "2", "3"]: decor += "-rnfZUujszZI/UZEFYJ269-I/AAAAAAAADnw/BbB-v_QWo1w/s1600/facebook-frown-emoticon.png'>"; break
            case ["4", "5", "6"]: decor += "-qODY1kxipZ0/Tv5dwDFFntI/AAAAAAAAAjM/cLXT6KEp-bE/s400/sunglasses%2Bemoticon.png'>"; break
            default: decor = ""
        }
        out << deco
        out << body()
        out << decor
    }
}
