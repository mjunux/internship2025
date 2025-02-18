//const submitButton = document.getElementById("submit")
//    submitButton.addEventListener('click', (e) => {
//      console.log(confirm("操作を実行します"))
//    })

const submitButton = document.getElementById("submit")
    submitButton.addEventListener('click', (e) => {
      let boolean = confirm("操作を実行します")
      if(boolean == false){
        //もしダイアログ内の「キャンセル」が押されたら画面遷移しない
         e.preventDefault();
      }
    })