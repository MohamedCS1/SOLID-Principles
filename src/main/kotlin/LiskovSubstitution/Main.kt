package LiskovSubstitution

fun main(args: Array<String>) {

    val database = PostsDatabase()
    val listPosts = arrayOf("original Post" ,"#tag post" ,"@mention post")

    var postObject:Post
    listPosts.forEach {
        post->
        if (post.startsWith("#"))
        {
            postObject = TagPost()
        }
        else if (post.startsWith("@"))
        {
            postObject = MentionPost()
        }
        else
        {
            postObject = Post()
        }
        val result = postObject.createPost(database ,post)
        println(result)
    }

}