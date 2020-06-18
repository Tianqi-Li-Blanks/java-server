function onlineShopClient() {
    this.searchProductByTitle = searchProductByTitle
    this.findCoke = findCoke
    this.findProductByID = findProductByID


    function searchProductByTitle(title) {
        return fetch("https://amazon-price1.p.rapidapi.com/search?keywords=apple&marketplace=US".replace('apple', title), {
            "method": "GET",
            "headers": {
                "x-rapidapi-host": "amazon-price1.p.rapidapi.com",
                "x-rapidapi-key": "fc6203c746msh05c6757930968d3p10ea0ejsne3ad81739582"
            }
        })
            .then(function (response) {
                return response.json()
            })
    }

    function findCoke() {
        return fetch("https://amazon-price1.p.rapidapi.com/search?keywords=coke&marketplace=US", {
            "method": "GET",
            "headers": {
                "x-rapidapi-host": "amazon-price1.p.rapidapi.com",
                "x-rapidapi-key": "fc6203c746msh05c6757930968d3p10ea0ejsne3ad81739582"
            }
        })
            .then(function (response) {
                return response.json()
            })
    }

    function findProductByID(ID) {
        return fetch("https://amazon-price1.p.rapidapi.com/priceReport?asin=coke&marketplace=US".replace('coke', ID), {
            "method": "GET",
            "headers": {
                "x-rapidapi-host": "amazon-price1.p.rapidapi.com",
                "x-rapidapi-key": "fc6203c746msh05c6757930968d3p10ea0ejsne3ad81739582"
            }
        })
            .then(function (response) {
                return response.json()
            })
    }


}