import UIKit

class CustomUnit: Codable {
    let referenceId: String
    let invoiceId: String
    let description: String
    let softDescriptor: String
    let price: String
    let currency: String

    init(referenceId: String,invoiceId: String,description: String,softDescriptor: String, price: String, currency: String) {
        self.referenceId = referenceId
        self.invoiceId = invoiceId
        self.description = description
        self.softDescriptor = softDescriptor
        self.price = price
        self.currency = currency
    }
}