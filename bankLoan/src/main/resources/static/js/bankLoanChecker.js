function updateInterestRate() {
    var loanAmount = document.getElementById("loanAmount").value;
    var interestRateText = '';

    switch (loanAmount) {
        case '100':
            interestRateText = '14.6%';
            break;
        case '200':
            interestRateText = '13.6%';
            break;
        case '300':
            interestRateText = '10.6%';
            break;
        case '500':
            interestRateText = '7.6%';
            break;
        case '1000':
            interestRateText = '6.1%';
            break;
        default:
            interestRateText = '';
            break;
    }

    document.getElementById("interestRate").textContent = interestRateText;
    document.getElementById("hiddenInterestRate").value = interestRateText;
}
