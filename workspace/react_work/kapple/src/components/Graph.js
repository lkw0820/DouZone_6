import React, { useEffect, useState } from 'react';
//import * as echarts from 'echarts'; // Make sure to import echarts library
//import echarts from "echarts"
import ECharts, { EChartsReactProps } from 'echarts-for-react';

const Graph = ({ proposal, names, maxPrice, maxQuantity, retailer }) => {

    const [options,setOptions] = useState({
        title: {
            text: 'comparison'
        },
        legend: {
        data: ["a","b","c"]//names //공급사 이름
        },
        radar: {
        // shape: 'circle',
        indicator: [
            { name: '단가', max: 10 },
            { name: '수량', max: 10 },
            { name: '불량률', max: 10 },
            { name: '품질 등급', max: 10 },
            { name: '생산 기간', max: 10 }
        ]
        },
        series: [
        {
            name: 'comparison',
            type: 'radar',
            data: [[1,1,1,1,1],
                    [2,2,2,2,2],
                    [3,3,3,3,3],
                ]//proposal //제안 정보  2차 배열 (단가, 수량, 불량률, 품질등급, 생산기간)
        }
        ],
        grid: {
            left: 50, // 그래프 영역의 왼쪽 여백
            right: 50, // 그래프 영역의 오른쪽 여백
            top: 50, // 그래프 영역의 위쪽 여백
            bottom: 50 // 그래프 영역의 아래쪽 여백
        }
    })
    const [options2,setOptions2]= useState({
        tooltip: {
            trigger: 'axis',
            axisPointer: {
              type: 'cross',
              crossStyle: {
                color: '#999'
              }
            }
          },
          toolbox: {
            feature: {
              dataView: { show: true, readOnly: false },
              magicType: { show: true, type: ['line', 'bar'] },
              restore: { show: true },
              saveAsImage: { show: true }
            }
          },
          legend: {
            data: ['예상 판매량', '단가']
          },
          xAxis: [
            {
              type: 'category',
              data: ["a","b","c","d","e",],//names, 
              axisPointer: {
                type: 'shadow'
              }
            }
          ],
          yAxis: [
            {
              type: 'value',
              name: '예측 판매량',
              min: 0,
              max: 	100,
              interval: 10,
              axisLabel: {
                formatter: '{value} 개'
              }
            },
            {
              type: 'value',
              name: '단가',
              min: 0,
              max: 10000,
              interval: 1000,
              axisLabel: {
                formatter: '{value} 만원'
              }
            }
          ],
          series: [
            {
              name: '예측판매량',
              type: 'bar',
              tooltip: {
                valueFormatter: function (value) {
                  return value + ' 개';
                }
              },
              data: [34,25,64,10,89] //predictAmount 예측 판매 개수
            },

            {
              name: '단가',
              type: 'line',
              yAxisIndex: 1,
              tooltip: {
                valueFormatter: function (value) {
                  return value + ' 만원';
                }
              },
              data: [2000,4000,3000,8000,5000] //predictPrice 예측 판매 단가
            }
          ],
          grid: {
            left: 100, // 그래프 영역의 왼쪽 여백
            right: 100, // 그래프 영역의 오른쪽 여백
            top: 100, // 그래프 영역의 위쪽 여백
            bottom: 100 // 그래프 영역의 아래쪽 여백
        }
    })
    
    return (
        <ECharts option={retailer?options2:options} opts={{ renderer: 'svg', width: '600px', height: '500px' }} />
    )
};

export default Graph;
