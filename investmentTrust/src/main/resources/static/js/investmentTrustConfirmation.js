const submitButton = document.getElementById("submit")
    submitButton.addEventListener('click', (e) => {
        var tf = confirm("この内容でよろしいでしょうか？");
        console.log(tf);
        console.log(submitButton);
        if(tf === false){
            e.preventDefault();
        }
    })