"use client"

import React from 'react'
import { Button } from './ui/button'
import { Toggle } from './ui/toggle'
import { Progress } from './ui/progress'
import { Play, Pause, SkipForward, SkipBack } from 'lucide-react'

export function AudioPlayer() {
    const [ pressed, setPresssed ] = React.useState<boolean>(false);
    function togglePressed() {
        setPresssed(prevPressed => !prevPressed);
    }

  return (
    <div className='w-full flex justify-around'>
        <div className='w-40 pl-4 flex flex-row'>
            <div className='w-12 h-12 mr-2 rounded-xl bg-accent'></div>
            <div>
                <p>Fur Elise</p>
                <small>Mozart</small>
            </div>
        </div>
        <div className='px-6 pb-6 grow mr-20 justify-center'>
            <div className='w-full pb-4 flex justify-center'>
                <Button className='mx-4' variant="outline" size="icon"><SkipBack/></Button>
                <Toggle onPressedChange={togglePressed} className='mx-4 data-[state=on]:bg-background hover:data-[state=on]:bg-accent' variant="outline">
                    {
                        !pressed ? <Play/> : <Pause/>
                    }
                </Toggle>
                <Button className='mx-4' variant="outline" size="icon"><SkipForward /></Button>
            </div>
            <div className='w-full'>
                <Progress value={30} className=''/>
            </div>
        </div>
    </div>
  ) 
}

export default AudioPlayer
