fun main() {
        val winningBid = Bid(5000, "Private Collector")

        println("Item A foi vendido por  ${auctionPrice(winningBid, 2000)}.")
        println("Item B foi vendido por ${auctionPrice(null, 3000)}.")
        }

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
        // Fill in the code.
        return bid?.amount ?: minimumPrice

        }

/*
A solução usa uma chamada segura e o operador Elvis ?. para retornar o preço correto:

 */