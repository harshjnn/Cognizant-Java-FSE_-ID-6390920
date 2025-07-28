import React from "react";
import Post from "./Post";

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                const posts = data.map(item => new Post(item.id, item.title, item.body));
                this.setState({ posts });
            })
            .catch(error => {
                console.error("Fetch error:", error);
                this.setState({ hasError: true });
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        console.error("Rendering error caught:", error);
        this.setState({ hasError: true });
    }

    render() {
        if (this.state.hasError) {
            return <h3>Oops! Something went wrong while displaying the posts.</h3>;
        }

        return (
            <div>
                <h2>Posts</h2>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ marginBottom: "1rem" }}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;
