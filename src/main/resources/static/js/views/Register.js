import createView from "../createView.js";

export default function Register(){

    return `
    <header>
    <h1>Registration</h1>
    </header>
    <main>
    <form>
        <input type="text" placeholder="Username" id="username">
        <input type="text" placeholder="Email" id="email">
        <input type="password" placeholder="Password" class="password">
        <button id="register-btn" type="button">Register</button>
    </form>
    </main>
    
    `;

}

export function RegisterEvent(){


    $("#register-btn").click(function () {

        let user = {
            username: $('#username').val(),
            email: $('#email').val(),
            password: $('.password').val()
        }

        let request = {
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(user)
        };

        fetch("http://localhost:8080/api/users", request)
            .then((response) => {
                console.log(response.status)
                createView("/");
            });


    })

}