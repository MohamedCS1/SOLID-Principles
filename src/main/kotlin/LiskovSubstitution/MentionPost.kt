package LiskovSubstitution

class MentionPost:Post() {
    override fun createPost(db: PostsDatabase, post: String): String {
        return db.addMentionPost(post)
    }
}