function updateInterestRate() {
    var loanAmount = document.getElementById("loanAmount").value;
    var interestRateText = '';

    switch (loanAmount) {
        case '100':
            interestRateText = '3.0%';
            break;
        case '200':
            interestRateText = '2.8%';
            break;
        case '300':
            interestRateText = '2.5%';
            break;
        case '500':
            interestRateText = '2.2%';
            break;
        case '1000':
            interestRateText = '2.0%';
            break;
        default:
            interestRateText = 'お借入れ金額を選択してください';
            break;
    }

    document.getElementById("interestRate").textContent = interestRateText;
}
