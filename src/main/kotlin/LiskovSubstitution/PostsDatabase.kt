package LiskovSubstitution

class PostsDatabase {
    fun add(post:String):String
    {
        return "Original Post: $post"
    }

    fun addTagPost(post:String):String
    {
        return "Tag Post: $post"
    }

    fun addMentionPost(post:String):String
    {
        return "Mention Post: $post"
    }
}