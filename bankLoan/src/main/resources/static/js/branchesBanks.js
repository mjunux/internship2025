//選ぶことができる支店名が金融機関によって変わるようにする
const branchesByBank = {
    "藤井銀行": ["まつり支店", "きらり支店", "ガーデン支店"],
    "東京りんご銀行": ["丸の内支店", "細道支店", "歌舞伎町支店"],
    "魚動中央銀行": ["踊り子支店", "バッハ支店", "宝島支店"]

};

// 金融機関名が変更されたときに支店名を更新する関数
function updateBranches() {
    const bankName = document.getElementById("bankName").value;
    const branchSelect = document.getElementById("branchName");

    branchSelect.innerHTML = '<option value="">選択してください</option>';

    if (bankName) {
        const branches = branchesByBank[bankName];
            if (branches) {
                branches.forEach(function(branch) {
                    const option = document.createElement("option");
                    option.value = branch;
                    option.textContent = branch;
                    branchSelect.appendChild(option);
                });
            }
    }
}