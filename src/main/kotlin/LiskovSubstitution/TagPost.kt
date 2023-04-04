package LiskovSubstitution

class TagPost:Post() {
    override fun createPost(db: PostsDatabase, post: String): String {
        return db.addTagPost(post)
    }
}