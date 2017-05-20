package main
import "fmt"

func process(a, b []int) (int, int) {
    var pointA, pointB int
    for i := 0; i < len(a); i++ {
        if a[i] > b[i] {
            pointA++
        }
        if a[i] < b[i] {
            pointB++
        }
    }
    return pointA, pointB
}

func main() {
    a := make([]int, 3)
    b := make([]int, 3)
    fmt.Scan(&a[0], &a[1], &a[2])
    fmt.Scan(&b[0], &b[1], &b[2])
    fmt.Print(process(a, b))
}
