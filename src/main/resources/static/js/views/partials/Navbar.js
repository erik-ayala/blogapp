export default function Navbar(props) {
    return `
<!--        <nav>-->
<!--            <a href="/" data-link>Home</a>-->
<!--            <a href="/posts" data-link>Posts</a>-->
<!--            <a href="/about" data-link>About</a>-->
<!--            <a href="/login" data-link>Login</a>-->
<!--            <a href="/register" data-link>Register</a>-->
<!--        </nav>-->

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="/" data-link>Home</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link" href="/posts" data-link>Posts <span class="sr-only"></span></a>
                <a class="nav-item nav-link" href="/about" data-link>About</a>
                <a class="nav-item nav-link" href="/login" data-link>Login</a>
                <a class="nav-item nav-link" href="/register" data-link>Register</a>
            </div>
            </div>
            </nav>
    `;
}