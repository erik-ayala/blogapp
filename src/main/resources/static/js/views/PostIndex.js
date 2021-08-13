export default function PostIndex(props) {
    return `
        <header>
            <h1>Posts Page</h1>
        </header>
        <main>
            <div>
                ${props.posts.map(post => `<h3>${post.title}</h3>`).join('')}                         
                          
            </div>
                        
            <form>
                <div class="form-group">
                    <label for="exampleInputEmail1">Movie title</label>
                    <input type="text" class="newPost" id="movieTitle" >
                    
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Movie content</label>
                    <input type="text" class="newPost" id="movieContent">
                </div>
                
                <button onclick="postEvents" class="btn btn-primary" id="postBtn"> Submit</button>
            </form>
        </main>
    `;
}

export function postEvents() {
    // add create post

    var addEvenListener = function (event) {
        const title = document.getElementById('movieTitle').value;
        const content = document.getElementById('movieContent').value;

        const postObj = {title, content}
        console.log(postObj)

    }

    document.getElementById('postBtn').addEventListener('click', addEvenListener)
}