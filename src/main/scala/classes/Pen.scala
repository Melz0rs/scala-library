package classes

import abstractions.Product
import enums.ColorType.ColorType
import enums.ProductType

class Pen(price: Int, color: ColorType) extends Product(price, ProductType.Pen)
