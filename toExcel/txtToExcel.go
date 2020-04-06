package main

import (
	"fmt"
	"github.com/360EntSecGroup-Skylar/excelize"
)

/*
 * Before building, check local go version by running "go version", it should be 1.10 or later.
 * This implementation uses Excelize library(github.com/360EntSecGroup-Skylar/excelize). Run "go get github.com/360EntSecGroup-Skylar/excelize" to make sure the library is available in local go path.
 *
 * To build, run "go build txtToExcel.go".
 * To run, run "txtToExcel $txtfName" after build is successful. The output will be in the same directory.
 *
 * Convert customer profile from plain text blocks in txt into records in excel.
 */
func main() {

}

type client struct {
	FirstName string // Gardner
	LastName  string // Bradlee
	Direct    string // N,Direct
	Title     string // Business Dev mgr
	Company   string // Avery Dennison corp
	Addr1     string // No# Street, eg "224 industrial rd"
	City      string // fitchburg
	State     string // MA
	Zip       string // 01420-4651
	Country   string // USA
	Tel       string // (978)353-2218
	Email     string // gardner.bradlee@averydennison.com
}

func writeToExcel() {
	f := excelize.NewFile()
	// Create a new sheet
	index := f.NewSheet("Sheet2")
	// Set value of a cell.
	f.SetCellValue("Sheet2", "A2", "Hello World.")
	f.SetCellValue("Sheet1", "B2", 100)

	// Set active sheet of the workbook
	f.SetActiveSheet(index)
	if err := f.SaveAs("./Book1.xlsx"); err != nil {
		fmt.Println(err)
	}
}
