const data = document.getElementById("data")


let arr=[]
axios.get("http://localhost:8080/get-forms").then((res)=>{
    arr=res.data;
    showdata();
})

function showdata(){
    console.log(arr);
    arr.forEach((val, index)=>{
        data.innerHTML+=`
        <div style="border: 2px solid black; padding: 20px; border-radius: 8px; background-color: #f9f9f9; max-width: 400px; margin: 0 auto; box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);">

    <h1 style="font-size: 24px; font-weight: bold; margin-bottom: 10px;">
        ${val.name}
    </h1>

    <p style="font-size: 18px; margin-bottom: 5px;"><b>Email</b>: ${val.email}</p>
    <p style="font-size: 18px; margin-bottom: 5px;"><b>Department</b>: ${val.dept}</p>
    <p style="font-size: 18px; margin-bottom: 5px;"><b>Reg.No.</b>: ${val.regno}</p>

    <div style="background-color: #428bca; color: #fff; width: 40px; height: 40px; border-radius: 50%; display: flex; align-items: center; justify-content: center; font-size: 18px; font-weight: bold; position: absolute; top: 20px; right: 20px;">
        ${index + 1}
    </div>

</div>



        `;
    })
}