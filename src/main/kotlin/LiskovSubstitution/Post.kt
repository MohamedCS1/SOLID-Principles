package LiskovSubstitution

open class Post {

    open fun createPost(db:PostsDatabase ,post:String): String {
        return db.add(post)
    }
}