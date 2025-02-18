/*　元々のコード一応残してます。
const submitButton = document.getElementById("submit")
    submitButton.addEventListener('click', (e) => {
      console.log(confirm("操作を実行します"))
    })
*/

const submitButton = document.getElementById("submit");
const cancelButton = document.getElementById("cancel");

submitButton.addEventListener('click', (e) => {
  const isConfirmed = confirm("操作を実行しますか？"); // 確認ダイアログを表示

  if (!isConfirmed) { // キャンセルした場合
    e.preventDefault(); // 送信動作をキャンセル
    console.log("送信はキャンセルされました");
  } else {
    console.log("送信が実行されました");
  }
});

cancelButton.addEventListener('click', (e) => {
  console.log("キャンセルボタンがクリックされました");
  //必要があれば追記する予定
});
