package main
import "fmt"

func process(s, t, tree, fruitAmount int) int {
    var count, point int
    for i := 0; i < fruitAmount; i++ {
        fmt.Scan(&point)
        if (tree + point) >= s && (tree + point) <= t {
            count++
        }
    }    
    return count
}

func main() {
    var s, t, a, b, m, n int
    fmt.Scan(&s, &t, &a, &b, &m, &n)
    fmt.Println(process(s, t, a, m))
    fmt.Println(process(s, t, b, n))
}
