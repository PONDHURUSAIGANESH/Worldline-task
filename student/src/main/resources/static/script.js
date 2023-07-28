const student = document.getElementById("student")
const name = document.getElementById("name")
const email = document.getElementById("email")
const regno = document.getElementById("regno")
const dept =document.getElementById("dept")

form.addEventListener('submit',(e)=>{
    e.preventDefault();

    if(name.value!="" && email.value!="" && dept.value!="" && regno.value!=""){
        postData();
    }
})

async function postData(){
    const data={
        name:name.value,
        email:email.value,
        regno:regno.value,
        dept:dept.value
    }
    axios.post("http://localhost:8080/post-forms",data)
    .then((res)=>{
        window.location.href="/data";
    })
    .catch((err)=>console.log(err));
}